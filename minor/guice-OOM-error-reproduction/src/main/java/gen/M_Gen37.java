
  package gen;
  public class M_Gen37 {
  		@com.google.inject.Inject
  		public M_Gen37(M_Gen38 m_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  