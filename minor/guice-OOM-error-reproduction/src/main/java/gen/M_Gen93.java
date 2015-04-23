
  package gen;
  public class M_Gen93 {
  		@com.google.inject.Inject
  		public M_Gen93(M_Gen94 m_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  