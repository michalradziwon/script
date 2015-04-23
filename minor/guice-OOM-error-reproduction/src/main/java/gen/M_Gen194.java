
  package gen;
  public class M_Gen194 {
  		@com.google.inject.Inject
  		public M_Gen194(M_Gen195 m_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  