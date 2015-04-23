
  package gen;
  public class M_Gen50 {
  		@com.google.inject.Inject
  		public M_Gen50(M_Gen51 m_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  