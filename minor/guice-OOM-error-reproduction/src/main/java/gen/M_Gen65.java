
  package gen;
  public class M_Gen65 {
  		@com.google.inject.Inject
  		public M_Gen65(M_Gen66 m_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  