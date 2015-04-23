
  package gen;
  public class M_Gen121 {
  		@com.google.inject.Inject
  		public M_Gen121(M_Gen122 m_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  