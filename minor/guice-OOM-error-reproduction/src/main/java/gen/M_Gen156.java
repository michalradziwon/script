
  package gen;
  public class M_Gen156 {
  		@com.google.inject.Inject
  		public M_Gen156(M_Gen157 m_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  