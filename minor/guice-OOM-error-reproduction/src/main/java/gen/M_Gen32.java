
  package gen;
  public class M_Gen32 {
  		@com.google.inject.Inject
  		public M_Gen32(M_Gen33 m_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  