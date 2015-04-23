
  package gen;
  public class M_Gen177 {
  		@com.google.inject.Inject
  		public M_Gen177(M_Gen178 m_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  