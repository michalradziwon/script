
  package gen;
  public class M_Gen14 {
  		@com.google.inject.Inject
  		public M_Gen14(M_Gen15 m_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  