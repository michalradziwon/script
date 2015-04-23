
  package gen;
  public class M_Gen101 {
  		@com.google.inject.Inject
  		public M_Gen101(M_Gen102 m_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  