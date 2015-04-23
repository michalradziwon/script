
  package gen;
  public class M_Gen62 {
  		@com.google.inject.Inject
  		public M_Gen62(M_Gen63 m_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  