
  package gen;
  public class M_Gen89 {
  		@com.google.inject.Inject
  		public M_Gen89(M_Gen90 m_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  