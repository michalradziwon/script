
  package gen;
  public class M_Gen118 {
  		@com.google.inject.Inject
  		public M_Gen118(M_Gen119 m_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  