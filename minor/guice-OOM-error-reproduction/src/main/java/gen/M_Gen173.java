
  package gen;
  public class M_Gen173 {
  		@com.google.inject.Inject
  		public M_Gen173(M_Gen174 m_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  