
  package gen;
  public class M_Gen123 {
  		@com.google.inject.Inject
  		public M_Gen123(M_Gen124 m_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  