
  package gen;
  public class M_Gen184 {
  		@com.google.inject.Inject
  		public M_Gen184(M_Gen185 m_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  