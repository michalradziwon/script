
  package gen;
  public class M_Gen143 {
  		@com.google.inject.Inject
  		public M_Gen143(M_Gen144 m_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  