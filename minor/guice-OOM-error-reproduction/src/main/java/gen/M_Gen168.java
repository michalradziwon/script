
  package gen;
  public class M_Gen168 {
  		@com.google.inject.Inject
  		public M_Gen168(M_Gen169 m_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  