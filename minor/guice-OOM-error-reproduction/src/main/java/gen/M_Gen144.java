
  package gen;
  public class M_Gen144 {
  		@com.google.inject.Inject
  		public M_Gen144(M_Gen145 m_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  