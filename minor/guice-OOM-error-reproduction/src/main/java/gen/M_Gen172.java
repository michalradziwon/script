
  package gen;
  public class M_Gen172 {
  		@com.google.inject.Inject
  		public M_Gen172(M_Gen173 m_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  