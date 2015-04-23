
  package gen;
  public class M_Gen81 {
  		@com.google.inject.Inject
  		public M_Gen81(M_Gen82 m_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  