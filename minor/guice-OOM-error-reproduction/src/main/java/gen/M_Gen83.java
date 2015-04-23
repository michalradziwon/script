
  package gen;
  public class M_Gen83 {
  		@com.google.inject.Inject
  		public M_Gen83(M_Gen84 m_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  