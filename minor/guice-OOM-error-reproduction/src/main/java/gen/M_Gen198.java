
  package gen;
  public class M_Gen198 {
  		@com.google.inject.Inject
  		public M_Gen198(M_Gen199 m_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  