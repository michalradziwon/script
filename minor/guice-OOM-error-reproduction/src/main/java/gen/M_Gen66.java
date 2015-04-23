
  package gen;
  public class M_Gen66 {
  		@com.google.inject.Inject
  		public M_Gen66(M_Gen67 m_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  