
  package gen;
  public class M_Gen133 {
  		@com.google.inject.Inject
  		public M_Gen133(M_Gen134 m_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  