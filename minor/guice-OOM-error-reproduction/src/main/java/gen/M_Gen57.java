
  package gen;
  public class M_Gen57 {
  		@com.google.inject.Inject
  		public M_Gen57(M_Gen58 m_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  