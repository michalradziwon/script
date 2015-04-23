
  package gen;
  public class M_Gen158 {
  		@com.google.inject.Inject
  		public M_Gen158(M_Gen159 m_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  