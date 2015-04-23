
  package gen;
  public class M_Gen128 {
  		@com.google.inject.Inject
  		public M_Gen128(M_Gen129 m_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  