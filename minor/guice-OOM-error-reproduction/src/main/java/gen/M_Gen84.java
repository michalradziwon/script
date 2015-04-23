
  package gen;
  public class M_Gen84 {
  		@com.google.inject.Inject
  		public M_Gen84(M_Gen85 m_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  