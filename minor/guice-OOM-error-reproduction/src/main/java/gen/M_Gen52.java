
  package gen;
  public class M_Gen52 {
  		@com.google.inject.Inject
  		public M_Gen52(M_Gen53 m_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  