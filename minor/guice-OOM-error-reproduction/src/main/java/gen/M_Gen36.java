
  package gen;
  public class M_Gen36 {
  		@com.google.inject.Inject
  		public M_Gen36(M_Gen37 m_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  