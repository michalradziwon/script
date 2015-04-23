
  package gen;
  public class M_Gen1 {
  		@com.google.inject.Inject
  		public M_Gen1(M_Gen2 m_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  