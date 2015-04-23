
  package gen;
  public class M_Gen19 {
  		@com.google.inject.Inject
  		public M_Gen19(M_Gen20 m_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  