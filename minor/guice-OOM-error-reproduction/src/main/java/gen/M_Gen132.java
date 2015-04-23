
  package gen;
  public class M_Gen132 {
  		@com.google.inject.Inject
  		public M_Gen132(M_Gen133 m_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  