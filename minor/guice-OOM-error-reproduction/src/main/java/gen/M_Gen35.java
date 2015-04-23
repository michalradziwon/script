
  package gen;
  public class M_Gen35 {
  		@com.google.inject.Inject
  		public M_Gen35(M_Gen36 m_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  