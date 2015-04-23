
  package gen;
  public class M_Gen63 {
  		@com.google.inject.Inject
  		public M_Gen63(M_Gen64 m_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  