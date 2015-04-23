
  package gen;
  public class M_Gen183 {
  		@com.google.inject.Inject
  		public M_Gen183(M_Gen184 m_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  