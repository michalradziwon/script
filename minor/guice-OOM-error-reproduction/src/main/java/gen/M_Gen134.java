
  package gen;
  public class M_Gen134 {
  		@com.google.inject.Inject
  		public M_Gen134(M_Gen135 m_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  