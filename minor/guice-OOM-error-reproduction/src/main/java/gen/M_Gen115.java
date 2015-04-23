
  package gen;
  public class M_Gen115 {
  		@com.google.inject.Inject
  		public M_Gen115(M_Gen116 m_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  