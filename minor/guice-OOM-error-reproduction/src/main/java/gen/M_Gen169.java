
  package gen;
  public class M_Gen169 {
  		@com.google.inject.Inject
  		public M_Gen169(M_Gen170 m_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  