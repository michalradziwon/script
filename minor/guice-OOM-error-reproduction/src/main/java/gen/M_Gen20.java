
  package gen;
  public class M_Gen20 {
  		@com.google.inject.Inject
  		public M_Gen20(M_Gen21 m_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  