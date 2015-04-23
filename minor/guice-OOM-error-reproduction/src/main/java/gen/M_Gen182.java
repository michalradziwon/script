
  package gen;
  public class M_Gen182 {
  		@com.google.inject.Inject
  		public M_Gen182(M_Gen183 m_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  