
  package gen;
  public class M_Gen88 {
  		@com.google.inject.Inject
  		public M_Gen88(M_Gen89 m_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  