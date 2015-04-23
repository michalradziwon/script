
  package gen;
  public class M_Gen154 {
  		@com.google.inject.Inject
  		public M_Gen154(M_Gen155 m_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  