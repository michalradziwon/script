
  package gen;
  public class M_Gen16 {
  		@com.google.inject.Inject
  		public M_Gen16(M_Gen17 m_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  