
  package gen;
  public class M_Gen40 {
  		@com.google.inject.Inject
  		public M_Gen40(M_Gen41 m_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  