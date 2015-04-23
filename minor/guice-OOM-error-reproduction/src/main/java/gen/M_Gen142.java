
  package gen;
  public class M_Gen142 {
  		@com.google.inject.Inject
  		public M_Gen142(M_Gen143 m_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  