
  package gen;
  public class M_Gen157 {
  		@com.google.inject.Inject
  		public M_Gen157(M_Gen158 m_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  