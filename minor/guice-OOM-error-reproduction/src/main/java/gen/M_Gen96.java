
  package gen;
  public class M_Gen96 {
  		@com.google.inject.Inject
  		public M_Gen96(M_Gen97 m_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  