
  package gen;
  public class M_Gen47 {
  		@com.google.inject.Inject
  		public M_Gen47(M_Gen48 m_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  