
  package gen;
  public class M_Gen79 {
  		@com.google.inject.Inject
  		public M_Gen79(M_Gen80 m_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  