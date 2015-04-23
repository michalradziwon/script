
  package gen;
  public class M_Gen110 {
  		@com.google.inject.Inject
  		public M_Gen110(M_Gen111 m_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  