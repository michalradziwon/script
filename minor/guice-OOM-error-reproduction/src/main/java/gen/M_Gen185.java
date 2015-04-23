
  package gen;
  public class M_Gen185 {
  		@com.google.inject.Inject
  		public M_Gen185(M_Gen186 m_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  