
  package gen;
  public class M_Gen12 {
  		@com.google.inject.Inject
  		public M_Gen12(M_Gen13 m_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  